
public class Fraction {

		 private int numerateur;
		 private int denominateur;


		/**Constructeur**/
		 public Fraction(){
		  this.numerateur=0;
		  this.denominateur=1;
		 }
		 public Fraction(int unNumerateur,int unDenominateur){
		  this.numerateur=unNumerateur;
		  this.denominateur=unDenominateur;
		 }
		 public Fraction(int unNumerateur){
		  this.numerateur=unNumerateur;
		  this.denominateur=1;
		 }

	public String toString() {
		System.out.println("Fraction = "+ this.numerateur +"/" + this. denominateur);
		return "Fraction : " + this.numerateur + "/" + this.denominateur;
	
	}
	

}
