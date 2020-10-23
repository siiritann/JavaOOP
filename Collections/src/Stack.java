public class Stack {
    public static void main(String[] args) {
        Stack newsFeed = new Stack();
        newsFeed.push("Morning news");
        newsFeed.push("Afternoon news");
        newsFeed.push("Evening news");
        String breakingNews = (String) newsFeed.pop();
        System.out.println(breakingNews);
        String peekNews = (String) newsFeed.peek();

    }

}
