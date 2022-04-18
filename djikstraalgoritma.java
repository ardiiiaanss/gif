public class djikstraalgoritma {
    
}
public static void main(String[] args) {
    int graph [][] new int[][]{ {4,101,8}
                                {2,302,10}
                                {50,430,45}
                                {8,106,9} };
    int minDistance = integer.MAX.VALUE;
    int minVertexDist = -1;
    int [] distance =new int[3];
    boolean[]visited =new boolean[3];

    for (int i=0;i<5;i++){
        distance[i]=integer.MAX_VALUE; //dianggap jaraktiap node belum tahu
        visited[i]false;//dianggap tiap node belumpernah dikunjungi
    }
    distance[0] = 0;//dimulainya node A
    for(int t=0;t<5;t++ ){
        system.out.println("Arraydistance is = " +distance[t]);
    }

    for(int s=0;s<5;t++){
        system.out.println("looping = " + s);
        system.out.println("visited = " + visited[s]);
        system.out.println("distane["+ s+"] = " + distance[s]);
        system.out.println("mindistance = " + minDistance);
        if(!visited[s] && distance[s <= minDistance]){
            system.out.println("HASIL ");
            minDistance = distance[s];
            minVertexDist = s ;
            system.out.println("MinDistance = " + minDistance);
            system.out.println("MinVertex = " + minVertexDist + "\n")
        }
    }
    system.out.println("");
    int u = minVertexDist;
    for(int v=0;v5;v++){
        system.out.println("looping v = " + v);
        system.out.println("visited[" + v + "]");
        if(visited[v] && graph[u][v] !=0 && (distance[u]+graph[u][v] < distance[v])){
            system.out.println("HASIL");
            system.out.println("GRAPH[" + u + "][" + v +"] = "+graph[u][v]);
            system.out.println("distance[" + v + "] v = " + distance[v]+ "\n");
        }
    }

    for(int z=0;z<5;z++){
        system.out.println("distance is = " + distance[z]);
    }
}
