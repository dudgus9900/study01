package study01.test13;

public class asdasd {
String[] strs;
	
	public asdasd() {
		this.strs=new String[0];
	}
	public int size() {
		return this.strs.length;//this.strs.length=0
	}
	public void add(String str) {
		String[] tmpStr=this.strs;
		this.strs=new String[this.strs.length+1];//this.strs.length=0
		this.strs[this.strs.length-1]=str;//str=-1
		for(int i=0;i<tmpStr.length;i++) { //tmpStr.length=1  
			this.strs[i]=tmpStr[i];//지금부터는 strs.length=1
		}
	}
	public String toString() {
		String str="[";
		for(int i=0;i<strs.length;i++) {//strs.length=1
			str+=strs[i]+",";
		}
			str=str.substring(0,str.length());
			str+="]";
			return str;
	}
	public int indexOf(String str) {
		for(int i=0;i<1;i++) {
			if(str.contentEquals(strs[i])) {
				return i;//0
			}
		}
		return -1;
	}
	public void remove(String str) {
		int idx =indexOf(str);
		if(idx!=-1) {
			remove(idx);
		}
	}
	public void remove(int idx) {
		String[]tmp=strs;
		strs=new String[strs.length-1];
		for(int i=0;i<idx;i++) {
			strs[i]=tmp[i];
		}
		for(int i=idx+1;i<tmp.length;i++) {
			strs[i-1]=tmp[i];
		}
	}
	public static void main(String[]args) {
		asdasd asd=new asdasd();
		asd.add("가");
		asd.add("나");
		asd.add("다");
		asd.remove(1);
		
		System.out.println(asd);
		//System.out.println(asd.size());
		//System.out.println(asd.strs[0]+","+asd.strs[1]+","+asd.strs[2]);
	}
}

