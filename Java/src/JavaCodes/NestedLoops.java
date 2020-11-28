package JavaCodes;

public class NestedLoops {

	public static void main(String[] args) {
		for(int i = 0; i < 4; i++) {
			System.out.println("i love coding and practicing it");
		}
		
		System.out.println("*******************************************");
		
		String[] colors = {"blue", "red", "green", "purple"};
		for(int y = 0; y < 4; y++) {
			System.out.println(colors[y]);
		}

		System.out.println("*******************************************");
		
		String[][] fancyColors = { {"blue", "red", "green", "purple"},
		                         {"cyan", "ring", "run", "prize"}
		};            
		for(int row2 = 0;row2 < 2; row2++) {
			for(int col3 = 0; col3 < 3; col3++) {
				System.out.println(fancyColors[row2][col3]);
			}
		}
		
		System.out.println("*******************************************");
		
		String[][] yayColors = { {"pubg", "gungame", "creed", "purple"},
                                 {"cyan", "ding", "creedvr2", "blonde"}
        };            
            for(int row4 = 0;row4 < 2; row4++) {
             for(int col5 = 0; col5 < 3; col5++) {
              System.out.println(yayColors[row4][col5]);
             }

	}
            System.out.println("*******************************************");
            
            String[][] nahColors = { {"pubg", "civil", "crying", "frog"},
                                     {"can", "ding", "creedvr2", "blonde"}
      };            
                   for(int row6 = 0;row6 < 2; row6++) {
                    for(int col7 = 0; col7 < 3; col7++) {
                      System.out.println(nahColors[row6][col7]);
      }

                    System.out.println("***************************************");
  }
            
                String[][] heyColors = { {"pubg", "gunham", "creed", "bubble"},
                                         {"dingdong", "ding", "cansvr2", "blonde"}
             };            
                      for(int row64 = 0;row64 < 2; row64++) {
                       for(int col17 = 0; col17 < 3; col17++) {
                        System.out.println(heyColors[row64][col17]);
             }
 }
                          
                          System.out.println("*******************************");
                          
         String[][] brownColors = { {"pubg", "bambam", "creed", "purple"},
                                  {"yan", "sling", "creedvr2", "blonde"}
                  };            
         for(int row45 = 0;row45 < 2; row45++) {
          for(int col71 = 0; col71 < 3; col71++) {
            System.out.println(brownColors[row45][col71]);
                    }
        }
                                 
               System.out.println("*******************************");

               String[][] lightColors = { {"pubg", "bambam", "creed", "purple"},
                       {"yan", "sling", "creedvr2", "blonde"}
       };            
            for(int row89 = 0;row89 < 2; row89++) {
             for(int col1 = 0; col1 < 3; col1++) {
             System.out.println(lightColors[row89][col1]);
         }
}
                      
          System.out.println("*******************************");
               
	}

 }