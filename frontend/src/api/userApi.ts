import { api } from "./http";
import type { User } from "../types/User";

export const getUsers = () => {
  return api.get<User[]>("/api/user");
};
