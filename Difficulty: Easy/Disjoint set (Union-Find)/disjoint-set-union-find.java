/*Complete the function below*/
class GfG {
    int find(int par[], int x) {
        // add code here.
        if(par[x]==x)
        return x;
        
        return par[x]=find(par,par[x]);
        
    }

    void unionSet(int par[], int x, int z) {
        // add code here.
        
        int xpar=find(par,x);
        int zpar=find(par,z);
        
        if(xpar==zpar)
        return;
        
          par[xpar] = zpar;
        
    }
}