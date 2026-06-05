class Post {
    String content;
    Post prev, next;

    Post(String content) {
        this.content = content;
    }
}

class SocialMediaFeed {
    Post head, tail, current;

    // Add normal post
    void addPost(String content) {
        Post newPost = new Post(content);

        if (head == null) {
            head = tail = current = newPost;
        } else {
            tail.next = newPost;
            newPost.prev = tail;
            tail = newPost;
        }
    }

    // Display current post
    void showCurrentPost() {
        if (current != null)
            System.out.println("Current Post: " + current.content);
        else
            System.out.println("No posts available.");
    }

    // Next post
    void nextPost() {
        if (current != null && current.next != null) {
            current = current.next;
            showCurrentPost();
        } else {
            System.out.println("No next post.");
        }
    }

    // Previous post
    void previousPost() {
        if (current != null && current.prev != null) {
            current = current.prev;
            showCurrentPost();
        } else {
            System.out.println("No previous post.");
        }
    }

    // Delete current post
    void deleteCurrentPost() {
        if (current == null) return;

        System.out.println("Deleted: " + current.content);

        if (current.prev != null)
            current.prev.next = current.next;
        else
            head = current.next;

        if (current.next != null)
            current.next.prev = current.prev;
        else
            tail = current.prev;

        current = (current.next != null) ? current.next : current.prev;
    }

    // Insert sponsored post after current post
    void insertSponsoredPost(String content) {
        if (current == null) return;

        Post sponsored = new Post("[SPONSORED] " + content);

        sponsored.next = current.next;
        sponsored.prev = current;

        if (current.next != null)
            current.next.prev = sponsored;
        else
            tail = sponsored;

        current.next = sponsored;

        System.out.println("Sponsored post inserted.");
    }

    // Display all posts
    void displayFeed() {
        Post temp = head;
        System.out.println("\nFeed:");
        while (temp != null) {
            System.out.println(temp.content);
            temp = temp.next;
        }
    }
}

public class SocialMediaFeedDemo {    public static void main(String[] args) {

        SocialMediaFeed feed = new SocialMediaFeed();

        feed.addPost("Post 1: Vacation Photos");
        feed.addPost("Post 2: Coding Tips");
        feed.addPost("Post 3: Food Blog");

        feed.showCurrentPost();

        feed.nextPost();
        feed.insertSponsoredPost("Buy Premium Subscription!");

        feed.displayFeed();

        feed.deleteCurrentPost();

        feed.displayFeed();

        feed.previousPost();
    }
}