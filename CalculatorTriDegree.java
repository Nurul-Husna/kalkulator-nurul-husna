import java.lang.Math;
/**
 *class CalculatorTridegree
 *
 * @author nurul husna
 * @version 0.1
 */
public  class CalculatorTriDegree extends CalculatorTrigonometri
{
    /**
     * Constructor for objects of class CalculatorTriDegree
     */
    public CalculatorTriDegree()
    {
       
    }
    /**
     * konversi
     *
     * @param  double sudut
     * @return void
     */
    public void konversi(double sudut)
    {
        super.sudut = Math.toRadians(sudut);
    }
}