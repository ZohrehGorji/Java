package ad1.ss17.pa;


import java.util.*;

public class Graph {
    private ArrayList<ArrayList<Integer>> adjLists;
    private ArrayList<ArrayList<Integer>> adjLists_reverse;
    private int knoten;
    private int kanten;
    private boolean uniqueGraph = false;//if graph changed, ok is auf false eingesetzt.
    private boolean isstrongleyconnectedet = false;
    private int[] einganggrad;
    // private ArrayList DFSDFS;
    private ArrayList<Integer> BFS;
    private boolean[] visitedBFS;
    private boolean[] visitedDFS;
    private int[] resultOfDFS;
    private int[] DfsCounterEachNode;

    private LinkedList<Integer> savedlist = new LinkedList<Integer>();

    public Graph(int n) {
        this.knoten = n;
        this.kanten = 0;
        this.adjLists = new ArrayList<ArrayList<Integer>>();
        this.adjLists_reverse = new ArrayList<ArrayList<Integer>>();
        this.einganggrad = new int[n];
        this.visitedBFS = new boolean[n];
        this.visitedDFS = new boolean[n];
        //  DFSDFS=new ArrayList();
        this.DfsCounterEachNode = new int[knoten];
        resultOfDFS = new int[n];
        this.BFS = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            this.adjLists.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n; i++) {
            this.adjLists_reverse.add(new ArrayList<Integer>());
        }
    }

    public int numberOfNodes() {
        return this.knoten;
    }

    public int numberOfEdges() {
        return this.kanten;

    }

    public void addEdge(int v, int w) {
        if (v >= 0 && w >= 0 && v != w && !this.adjLists.get(v).contains(w)) {
            this.adjLists.get(v).add(w);
            this.uniqueGraph = false;
            this.kanten++;
            this.einganggrad[w]++;
            if (!this.adjLists.get(w).contains(v)) {
                this.adjLists_reverse.get(w).add(v);
            }
        }

    }

    public void addAllEdges(int v) {
        for (int i = 0; i < knoten; i++) {
            if (i != v) {
                addEdge(v, i);
            }
        }
    }

    public void deleteEdge(int v, int w) {
        int m = this.adjLists.get(v).indexOf(w);
        if (v != w && kanten != 0 && v >= 0 && v < adjLists.size() && w >= 0 && w < adjLists.size() && m >= 0 && m <= knoten) {
            if (adjLists.get(v).contains(w)) {
                this.adjLists.get(v).remove(this.adjLists.get(v).indexOf(w));
                this.einganggrad[w]--;
                this.kanten--;
                this.uniqueGraph = false;

            }
            if (this.adjLists.get(w).contains(v)) {
                this.adjLists_reverse.get(w).remove(this.adjLists_reverse.get(w).indexOf(v));


            }
        }
    }

    public void deleteAllEdges(int v) {

        if (v >= 0 && v <= this.knoten && !this.adjLists.get(v).isEmpty()) {
            for (int i = 0; i < numberOfNodes(); i++) {
                deleteEdge(v, i);
            }
        }
    /*    for (int i : adjLists.get(v)) {
                deleteEdge(v, i);
            }*/
    }

    public ArrayList<Integer> bfsSearch(int s) {
        this.BFS = new ArrayList<Integer>();
        this.visitedBFS = new boolean[knoten];
        this.visitedBFS[s] = true;

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(s);

        while (!q.isEmpty()) {
            int u = q.remove();
            this.BFS.add(u);
            for (int v : this.adjLists.get(u)) {
                if (!this.visitedBFS[v]) {
                    this.visitedBFS[v] = true;
                    q.add(v);
                }
            }

        }
        return BFS;
    }

    public void DFS1(int v) {
        visitedDFS[v] = true;
        this.DfsCounterEachNode[v]++;
        //  DFSDFS.add(v);
        this.resultOfDFS[v] = 1;

        for (int u : adjLists.get(v)) {

            if (!visitedDFS[u])
                DFS1(u);
        }
    }

    public void DFS(int v) {
        visitedDFS = new boolean[knoten];
        this.resultOfDFS = new int[knoten];
        DFS1(v);
    }


    public Iterable<Integer> getReachableNodes(int v) {
        List<Integer> nodes = new LinkedList<Integer>();
        if (kanten==0 ){return nodes;}

        if (knoten == 0) {
            nodes.add(0);
            return nodes;
        }
        if (knoten != 1) {

            if (isstrongleyconnectedet) {
                nodes = bfsSearch(0);
                nodes.remove(v);
                return nodes;
            }
        }
        DFS(v);
        for (int i = 0; i < this.resultOfDFS.length; i++) {
            if (this.resultOfDFS[i] == 1) {
                if (i != v) {
                    nodes.add(i);
                }
            }
        }
        return nodes;
    }

    public List<Integer> topSort() {
        if (!uniqueGraph) {
            int[] c = new int[this.knoten];
            LinkedList<Integer> list = new LinkedList<Integer>();
            for (int i = 0; i < this.knoten; i++) {
                c[i] = this.einganggrad[i];
                if (c[i] == 0) {
                    list.addFirst(i);
                }
            }


            // for (int i = 0; i < this.knoten; i++) {

            //  }


            while (!list.isEmpty()) {

                int m = list.removeFirst();
                savedlist.add(m);

                for (int i : adjLists.get(m)) {
                    c[i] = c[i] - 1;
                    if (c[i] == 0) {

                        {
                            list.addFirst(i);
                        }
                    }
                }
            }
            if (this.savedlist.size() < this.knoten) {
                this.savedlist.clear();
            }
            this.uniqueGraph = true;
        }
        return this.savedlist;
    }


    public boolean isDAG() {
        if (!this.uniqueGraph) {
            this.savedlist.clear();
            topSort();
        }
        return !topSort().isEmpty();
    }

    public int rankInOrder(int i) {


        if (!this.uniqueGraph) {
            this.savedlist.clear();
            topSort();
        }

        return this.savedlist.indexOf(i);


    }

    public void isStronglyConnectedhelp() {

        this.DfsCounterEachNode = new int[knoten];
        for (int i = 0; i < knoten; i++) {
            DFS(i);
        }

    }

    public boolean isStronglyConnected() {
        if (knoten == 1) {
            isstrongleyconnectedet = true;
            return true;
        }
        for (int i : einganggrad) {
            if (i == 0) {
                isstrongleyconnectedet = false;
                return false;
            }
        }
        isStronglyConnectedhelp();
        for (int i : DfsCounterEachNode) {
            if (i != knoten) {
                isstrongleyconnectedet = false;
                return false;
            }
        }
        isstrongleyconnectedet = true;
        return true;
    }


    public boolean checkComponent(int i, int j) {
        if (isstrongleyconnectedet) {
            return true;
        }
       /* if (!bfsSearch(i).contains(j) && !bfsSearch(j).contains(i)){
            return false;
        }*/
        boolean result = true;
        if (i != j) {
          /*  ArrayList<Object> a = new ArrayList<Object>();
            ArrayList<Object> b = new ArrayList<Object>();
            Iterable<Integer> A = getReachableNodes(i);
            Iterable<Integer> B = getReachableNodes(j);
            Iterator<Integer> aa = A.iterator();
            Iterator<Integer> bb = B.iterator();
           while (aa.hasNext()) {
                a.add(aa.next());
            }

            while (bb.hasNext()) {
                b.add(bb.next());
            }
            result = a.contains(j) && b.contains(i);*/
            //  result = bfsSearch(i).contains(j) && bfsSearch(j).contains(i);
            if (!bfsSearch(i).contains(j)) {
                return false;
            }
            if (!bfsSearch(j).contains(i)) {
                return false;
            }

        }
        return result;

    }


    public static void main(String[] args) {

    }
}



