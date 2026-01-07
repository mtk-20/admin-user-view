import { api } from "./http";
import type { User } from "../types/User";
import type { ApiResponse } from "../types/APiResponse";

export const getUsers = () => {
  return api.get<ApiResponse<User[]>>("/api/user");
};
