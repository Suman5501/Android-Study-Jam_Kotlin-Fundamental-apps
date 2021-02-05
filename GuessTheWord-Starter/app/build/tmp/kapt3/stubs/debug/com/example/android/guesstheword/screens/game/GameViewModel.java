package com.example.android.guesstheword.screens.game;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0014J\u0006\u0010\u001d\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bJ\u0006\u0010 \u001a\u00020\u001bJ\b\u0010!\u001a\u00020\u001bH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/android/guesstheword/screens/game/GameViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_currentTime", "Landroidx/lifecycle/MutableLiveData;", "", "_eventGameFinish", "", "_score", "", "_word", "", "currentTime", "Landroidx/lifecycle/LiveData;", "getCurrentTime", "()Landroidx/lifecycle/LiveData;", "eventGameFinish", "getEventGameFinish", "score", "getScore", "timer", "Landroid/os/CountDownTimer;", "word", "getWord", "wordList", "", "nextWord", "", "onCleared", "onCorrect", "onGameFinish", "onGameFinishComplete", "onSkip", "resetList", "Companion", "app_debug"})
public final class GameViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _currentTime = null;
    private final android.os.CountDownTimer timer = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _word = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _score = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _eventGameFinish = null;
    private java.util.List<java.lang.String> wordList;
    private static final long DONE = 0L;
    private static final long ONE_SECOND = 1000L;
    private static final long COUNTDOWN_TIME = 60000L;
    public static final com.example.android.guesstheword.screens.game.GameViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getCurrentTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getWord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getScore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getEventGameFinish() {
        return null;
    }
    
    /**
     * Resets the list of words and randomizes the order
     */
    private final void resetList() {
    }
    
    /**
     * Moves to the next word in the list
     */
    private final void nextWord() {
    }
    
    /**
     * Methods for buttons presses
     */
    public final void onSkip() {
    }
    
    public final void onCorrect() {
    }
    
    /**
     * Method for the game completed event
     */
    public final void onGameFinish() {
    }
    
    /**
     * Method for the game completed event
     */
    public final void onGameFinishComplete() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public GameViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/android/guesstheword/screens/game/GameViewModel$Companion;", "", "()V", "COUNTDOWN_TIME", "", "DONE", "ONE_SECOND", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}