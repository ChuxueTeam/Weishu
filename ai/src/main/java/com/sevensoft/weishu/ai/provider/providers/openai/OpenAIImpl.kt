package com.sevensoft.weishu.ai.provider.providers.openai

import kotlinx.coroutines.flow.Flow
import com.sevensoft.weishu.ai.provider.ProviderSetting
import com.sevensoft.weishu.ai.provider.TextGenerationResult
import com.sevensoft.weishu.ai.provider.TextGenerationParams
import com.sevensoft.weishu.ai.ui.StreamChunk
import com.sevensoft.weishu.ai.ui.UIMessage

interface OpenAIImpl {
    suspend fun generateText(
        providerSetting: ProviderSetting.OpenAI,
        messages: List<UIMessage>,
        params: TextGenerationParams,
    ): TextGenerationResult

    suspend fun streamText(
        providerSetting: ProviderSetting.OpenAI,
        messages: List<UIMessage>,
        params: TextGenerationParams,
    ): Flow<StreamChunk>
}
