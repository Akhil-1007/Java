class VowelOrConsonant{
	public static void main(String[] args) {
		//String s = args[0];
		char c = args[0].charAt(0);
		boolean vowel = false;
		char ch[] = {'A','E','I','O','U','a','e','i','o','u'};
		for(int i=0;i<ch.length;i++){
			if(c == ch[i]){
			 vowel = true;
			}
			
		}
		
		if(vowel){
			System.out.println(c+" is Vowel");
		}else{
			System.out.println(c+" is Consonant");
		}
	}
}