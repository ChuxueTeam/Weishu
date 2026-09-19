package com.sevensoft.weishu.di

import android.content.Context
import com.sevensoft.weishu.data.files.FileFolders
import com.sevensoft.weishu.data.files.FilesManager
import com.sevensoft.weishu.data.files.SkillManager
import com.sevensoft.weishu.data.repository.ConversationRepository
import com.sevensoft.weishu.data.repository.FavoriteRepository
import com.sevensoft.weishu.data.repository.FolderRepository
import com.sevensoft.weishu.data.repository.FilesRepository
import com.sevensoft.weishu.data.repository.GenMediaRepository
import com.sevensoft.weishu.data.repository.MemoryRepository
import com.sevensoft.weishu.data.repository.WorkspaceRepository
import com.sevensoft.weishu.workspace.ProotShellRunner
import com.sevensoft.weishu.workspace.RootfsInstaller
import com.sevensoft.weishu.workspace.WorkspaceBindMount
import com.sevensoft.weishu.workspace.WorkspaceManager
import org.koin.dsl.module
import java.io.File

val repositoryModule = module {
    single {
        ConversationRepository(get(), get(), get(), get(), get(), get())
    }

    single {
        FolderRepository(get(), get())
    }

    single {
        MemoryRepository(get())
    }

    single {
        GenMediaRepository(get())
    }

    single {
        FilesRepository(get())
    }

    single {
        FavoriteRepository(get())
    }

    single {
        val context: Context = get()
        WorkspaceManager(
            baseDir = File(context.filesDir, "workspaces"),
            shellRunner = ProotShellRunner(
                nativeLibraryDir = File(context.applicationInfo.nativeLibraryDir),
            ),
            // 同一份挂载表既用于 PRoot 的 -b 参数, 也用于文件工具的路径解析, 避免两处漂移
            bindMounts = listOf(
                WorkspaceBindMount(
                    source = File(context.filesDir, FileFolders.SKILLS).apply { mkdirs() },
                    target = "/skills",
                ),
                WorkspaceBindMount(
                    source = File(context.filesDir, FileFolders.TOOL_OUTPUTS).apply { mkdirs() },
                    target = "/tool_outputs",
                ),
                WorkspaceBindMount(
                    source = File(context.filesDir, FileFolders.UPLOAD).apply { mkdirs() },
                    target = "/upload",
                ),
            ),
        )
    }

    single {
        RootfsInstaller(get())
    }

    single {
        WorkspaceRepository(get(), get(), get(), get())
    }

    single {
        FilesManager(get(), get(), get())
    }

    single {
        SkillManager(get(), get())
    }
}
