export interface ApiResponse<T> {
    errorCode: string;
    success: boolean;
    message: string;
    result: T;
}