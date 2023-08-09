export interface ForumPost {
    postId: number;
    postTitle: string;
    postBody: string;
    postImage: Blob;
    ownerUserId: string;
}