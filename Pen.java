//Created by Piyuri Sahu
 interface Pen {
	 public void setColor(String color);
	 public void draw(String content); 
}

 class GreenPen implements Pen {
		private String color = null;
		public void setColor(String color) {
			this.color = color;
		}
		public void draw(String content) {
	        System.out.println("Drawing  "
	        		+ "content "
	        		+ "in color : " + color);
		}
}

class YellowPen implements Pen {
		private String color = null;
		public void setColor(String color) {
			this.color = color;
		}
		public void draw(String content) {
	        System.out.println("Drawing  "
	        		+ "content in color : "
	        		+ "" + color);
}}

class RedPen implements Pen {
		private String color = null;
		public void setColor(String color) {
			this.color = color;
		}
		public void draw(String content) {
	        System.out.println("Drawing  "
	        		+ "content in color : "
	        		+ color);
	        }
}