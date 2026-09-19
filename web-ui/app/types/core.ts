/**
 * Message role enum
 * @see ai/src/main/java/com/sevensoft/weishu/ai/core/MessageRole.kt
 */
export type MessageRole = "system" | "user" | "assistant" | "tool";

/**
 * Token usage information
 * @see ai/src/main/java/com/sevensoft/weishu/ai/core/Usage.kt
 */
export interface TokenUsage {
  promptTokens: number;
  completionTokens: number;
  cachedTokens: number;
  totalTokens: number;
}
