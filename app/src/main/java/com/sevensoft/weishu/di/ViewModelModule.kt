package com.sevensoft.weishu.di

import com.sevensoft.weishu.ui.pages.assistant.AssistantVM
import com.sevensoft.weishu.ui.pages.assistant.detail.AssistantDetailVM
import com.sevensoft.weishu.ui.pages.backup.BackupVM
import com.sevensoft.weishu.ui.pages.chat.ChatDrawerVM
import com.sevensoft.weishu.ui.pages.chat.ChatVM
import com.sevensoft.weishu.ui.pages.debug.DebugVM
import com.sevensoft.weishu.ui.pages.favorite.FavoriteVM
import com.sevensoft.weishu.ui.pages.search.SearchVM
import com.sevensoft.weishu.ui.pages.history.HistoryVM
import com.sevensoft.weishu.ui.pages.stats.StatsVM
import com.sevensoft.weishu.ui.pages.imggen.ImgGenVM
import com.sevensoft.weishu.ui.pages.extensions.PromptVM
import com.sevensoft.weishu.ui.pages.extensions.QuickMessagesVM
import com.sevensoft.weishu.ui.pages.extensions.skills.SkillDetailVM
import com.sevensoft.weishu.ui.pages.extensions.skills.SkillsVM
import com.sevensoft.weishu.ui.pages.extensions.workspace.WorkspaceDetailVM
import com.sevensoft.weishu.ui.pages.extensions.workspace.WorkspaceVM
import com.sevensoft.weishu.ui.pages.setting.SettingVM
import com.sevensoft.weishu.ui.pages.share.handler.ShareHandlerVM
import com.sevensoft.weishu.ui.pages.translator.TranslatorVM
import org.koin.core.module.dsl.viewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModel<ChatVM> { params ->
        ChatVM(
            id = params.get(),
            context = get(),
            settingsStore = get(),
            conversationRepo = get(),
            chatService = get(),
            filesManager = get(),
            favoriteRepository = get(),
        )
    }
    viewModelOf(::ChatDrawerVM)
    viewModelOf(::SettingVM)
    viewModelOf(::DebugVM)
    viewModelOf(::HistoryVM)
    viewModelOf(::AssistantVM)
    viewModel<AssistantDetailVM> {
        AssistantDetailVM(
            id = it.get(),
            settingsStore = get(),
            memoryRepository = get(),
            filesManager = get(),
            skillManager = get(),
            workspaceRepository = get(),
        )
    }
    viewModelOf(::TranslatorVM)
    viewModel<ShareHandlerVM> {
        ShareHandlerVM(
            text = it.get(),
            settingsStore = get(),
        )
    }
    viewModelOf(::BackupVM)
    viewModelOf(::ImgGenVM)
    viewModelOf(::PromptVM)
    viewModelOf(::QuickMessagesVM)
    viewModelOf(::SkillsVM)
    viewModelOf(::SkillDetailVM)
    viewModelOf(::WorkspaceVM)
    viewModel<WorkspaceDetailVM> {
        WorkspaceDetailVM(
            id = it.get(),
            repository = get(),
            terminalSessionManager = get(),
        )
    }
    viewModelOf(::FavoriteVM)
    viewModelOf(::SearchVM)
    viewModelOf(::StatsVM)
}
