package Models;

public class SearchResult {

    private Boolean _success;
    private Node _fetchedNode;
    private Node _parentNode;

    public SearchResult(
            Boolean success,
            Node fetchedNode,
            Node parentNode) {

        _success = success;
        _fetchedNode = fetchedNode;
        _parentNode = parentNode;

    }

}
