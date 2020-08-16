

	import javax.swing.JFrame;

	public class ShowWindow extends JFrame {
		private int length;
		private int width;
		private String title;
		
		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		
		
		public ShowWindow()
		{
			length=0;
			width=0;
		}
		public ShowWindow(int len, int w)
		{
			length = len;
			width = w;
		}

	}



