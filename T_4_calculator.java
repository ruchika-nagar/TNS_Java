public class T_4_calculator
{
	private int no1,no2;/*variable member*/
	/*member function*/
	public int getNo1() {
		return no1;
	}

	public void setNo1(int no1) {
		this.no1 = no1;
	}

	public int getNo2() {
		return no2;
	}

	public void setNo2(int no2) {
		this.no2 = no2;
	}

	@Override
	public String toString() {
		return "calculator [no1=" + no1 + ", n02=" + no2 + "]";
	}
		public int getAdd() {
			return(no1+no2);
		}
		
		public int getSub() {
			return(no1-no2);
		}
		public int getMul() {
			return(no1*no2);
		}
		public int getDiv() {
			return(no1/no2);
		}
	} 


