import csd214.bookstore.pojos.Stationery;


private Object pageCount() {
}

void main() {
}

public class Notebook extends Stationery {
    private int pageCount;

    @Override
    public void initialize() {
        super.initialize();

        System.out.println("How many pages it has? ");
        this.pageCount = getInput();
    }

    @Override
    public void sellItem() {
        System.out.println("Selling [Brand] Notebook with [pageCount] pages...");
        pageCount(pageCount());
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}

