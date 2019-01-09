package chosun.ciis.pl.base.wb;

import java.util.Hashtable;
import java.util.StringTokenizer;

import somo.framework.expt.AppException;
import chosun.ciis.pl.base.util.StringUtil;

public class BaseWB {
	
    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    /*
     * 가로 배열을 세로배열로 
     * {
     * 	{1,2,3,4,5}
     * ,{6,7,8,9,0}
     * } 
     * =>
     * {
     *  {1,6}
     * ,{2,7}
     * ,{3,8}
     * ,{4,9}
     * ,{5,0}
     * }
     * 
     */    
    public String[] convertMultiUpdateData(String multiUpdateData) throws AppException {
    	String[] 	retVal	= null;
    	
    	try{
	    	String[][] temp_arr = null;
	    	
	    	StringTokenizer st = new StringTokenizer(multiUpdateData, ROW_SEPARATOR);
	    	
	    	int rowCount  = 0;
	    	int colCount  = st.countTokens();
	    	int col = 0;
	    	int row = 0;
	    	while(st.hasMoreTokens()){
	    		row = 0;
	    		String token 	 	= st.nextToken();
	    		String[] token_arr 	= token.split(COL_SEPARATOR);
	    		if(temp_arr == null){
	    			rowCount = token_arr.length;
	    			temp_arr = new String[rowCount][colCount];
	    		}
	    		for(int i=0; i<token_arr.length; i++){
	    			temp_arr[row++][col] = token_arr[i];
	    		}
	    		col++;
	    	}
	    	
	    	retVal = new String[rowCount];
	    	
	    	for(int i=0; i<temp_arr.length; i++){
	    		StringBuffer sb = new StringBuffer();
	    		for(int j=1; j<temp_arr[i].length; j++){
	    			sb.append(StringUtil.nvl(temp_arr[i][j]));
	    			if(j<temp_arr[i].length-1){
	    				sb.append(COL_SEPARATOR);
	    			}
	    		}
	    		retVal[i] = sb.toString();
	    	}
    	}catch(Exception e){
    		throw new AppException("BaseWB.convertMultiUpdateData", e.getLocalizedMessage());
    	}
    	return retVal;
    }    
    
    public Hashtable getHashMultiUpdateData(String multiUpdateData) throws AppException {
    	Hashtable 	hash	= new Hashtable();
    	
    	try{
	    	String[][] temp_arr = null;
	    	
	    	StringTokenizer st = new StringTokenizer(multiUpdateData, ROW_SEPARATOR);
	    	
	    	int rowCount  = 0;
	    	int colCount  = st.countTokens();
	    	int col = 0;
	    	int row = 0;
	    	while(st.hasMoreTokens()){
	    		row = 0;
	    		String token 	 	= st.nextToken();
	    		String[] token_arr 	= token.split(COL_SEPARATOR);
	    		if(temp_arr == null){
	    			rowCount = token_arr.length;
	    			temp_arr = new String[rowCount][colCount];
	    		}
	    		for(int i=0; i<token_arr.length; i++){
	    			temp_arr[row++][col] = token_arr[i];
	    		}
	    		col++;
	    	}
	    	for(int i=0; i<temp_arr.length; i++){
	    		StringBuffer sb = new StringBuffer();
	    		String header   = temp_arr[i][0];
	    		for(int j=1; j<temp_arr[i].length; j++){
	    			sb.append(StringUtil.nvl(temp_arr[i][j]));
	    			if(j<temp_arr[i].length-1){
	    				sb.append(COL_SEPARATOR);
	    			}
	    		}
	    		
	    		hash.put(header, sb.toString());
	    	}
	    	
	    	
    	}catch(Exception e){
    		throw new AppException("BaseWB.getHashMultiUpdateData", e.getLocalizedMessage());
    	}
    	return hash;
    }     
}
