import { createContext, useContext, useState } from "react";
import { User } from "../types/User";

interface AuthContextType {
    user: User | null;
    login: (user: User) => void;
    logout: () => void;
}

const AuthContext = createContext<AuthContextType | null>(null);