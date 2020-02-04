
int[] bois;
 


int ran =  (int) random(height);
void setup(){
size(1000,500);
bois = new int[width];
aMethod();
noStroke();

}
void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}

void aMethod (){
  
  for(int i = 0; i<width;i++){
bois[i] = (int)random(height) ;
}

}


void draw(){
background(0,0,255);
  
  fill(255,0,0);
  
  for(int  i = 0 ; i < width;i++){
rect(i,height,15,-bois[i]);
  }
stepSort(bois);

if(mousePressed){
aMethod();
}


}
