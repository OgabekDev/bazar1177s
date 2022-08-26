package com.example.bazar1177s.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0007\u001a\u00020\bH\u0086 J\t\u0010\t\u001a\u00020\bH\u0086 R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/example/bazar1177s/network/Server;", "", "()V", "IS_TESTER", "", "getIS_TESTER", "()Z", "getDevelopment", "", "getProduction", "app_debug"})
public final class Server {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.bazar1177s.network.Server INSTANCE = null;
    private static final boolean IS_TESTER = true;
    
    private Server() {
        super();
    }
    
    public final boolean getIS_TESTER() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final native java.lang.String getDevelopment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final native java.lang.String getProduction() {
        return null;
    }
}