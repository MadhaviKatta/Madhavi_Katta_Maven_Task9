package epamtasktask9.Strings9;
public class Strings9 {
	public String m(String s)
    {
		StringBuilder b = new StringBuilder(s);
        if(s=="")
        {
        	return "";
        }
        else if(s.length()==1)
        {
        	if(b.charAt(0)=='A')
        	{
        		b.deleteCharAt(0);
        		return "";
        	}
        	else
        	{
        		return b.toString();
        	}
        }
        if(b.charAt(0)=='A')
        {
            b.deleteCharAt(0);
            if(b.charAt(0)=='A')
            {
            	b.deleteCharAt(0);
            }
        }
        else if(b.charAt(1)=='A')
        {
        	b.deleteCharAt(1);
        }
        return b.toString();
    }
}