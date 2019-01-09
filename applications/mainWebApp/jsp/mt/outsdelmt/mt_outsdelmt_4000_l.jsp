<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="java.io.*,java.sql.*,java.util.*,kr.co.comsquare.rwXmlLib.*,kr.co.comsquare.db.*,kr.co.comsquare.util.Tokenizer;"
%>

<%
	boolean buf = true;	//버퍼링 할건지 말건지
	
	RwText rt= new RwText();
	
	
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String str_cap	= "구분";
	String str_width	= "90";

	
	try {
		//System.out.println("START");
		//System.out.println("x_val=" + request.getParameter("x_val"));
		String x_val		= request.getParameter("x_val");
		int x_fr			= Integer.parseInt(request.getParameter("x_fr"));
		int x_to			= Integer.parseInt(request.getParameter("x_to"));
		int x_term			= Integer.parseInt(request.getParameter("x_term"));
		int x_width 		= 920;
		String x_logic_1	= request.getParameter("x_logic_1");
		String x_logic_2	= request.getParameter("x_logic_2");
		String x_op			= request.getParameter("x_op");
		String x_logic		= "";
		String[] x_col		= null;
		int set_x_val 		= 0;
		int x_interval 		= 0;
		int x_col_width		= 0;
		
		System.out.println("x_val =" + x_val);
		System.out.println("x_fr =" + x_fr);
		System.out.println("x_to =" + x_to);
		System.out.println("x_term =" + x_term);
		System.out.println("x_logic_1 =" + x_logic_1);
		System.out.println("x_logic_2 =" + x_logic_2);
		System.out.println("x_op =" + x_op);

		
		if (x_op.equals("")) {
			x_logic = "(" + x_logic_1 + ")";
		} else {
			x_logic = "(" + x_logic_1 + ")" + x_op + "(" + x_logic_2 + ")";
		}
		
		x_interval 			= Math.round((x_to - x_fr) / x_term) + 1;
		x_col_width			= Math.round(x_width / (x_interval + 2));
		
		x_col = new String[x_interval];
		
		for (int i=0; i< x_col.length; i++){
			if (set_x_val == 0){
				set_x_val = x_fr;
			} else {
				set_x_val = set_x_val + x_term;
			}
			if (set_x_val <= x_to){
				x_col[i] = Integer.toString(Math.round(set_x_val));
				//System.out.println("x_col[" + i + "]= " + x_col[i]);
			}
		}
		
		String y_val		= request.getParameter("y_val");
		int y_fr			= Integer.parseInt(request.getParameter("y_fr"));
		int y_to			= Integer.parseInt(request.getParameter("y_to"));
		int y_term			= Integer.parseInt(request.getParameter("y_term"));
		int y_width 		= 920;
		String y_logic_1	= request.getParameter("y_logic_1");
		String y_logic_2	= request.getParameter("y_logic_2");
		String y_op			= request.getParameter("y_op");
		String y_logic		= "";
		String[] y_col		= null;
		int set_y_val 		= 0;
		int y_interval 		= 0;
		int y_col_width		= 0;
		
		//System.out.println("y_val =" + y_val);
		//System.out.println("y_fr =" + y_fr);
		//System.out.println("y_to =" + y_to);
		//System.out.println("y_term =" + y_term);
		//System.out.println("y_logic_1 =" + y_logic_1);
		//System.out.println("y_logic_2 =" + y_logic_2);
		//System.out.println("y_op =" + y_op);
		
		if (y_op.equals("")) {
			y_logic = "(" + y_logic_1 + ")";
		} else {
			if (y_logic_2.equals("")){
				y_logic = "(" + y_logic_1 + ")";
			} else {
				y_logic = "(" + y_logic_1 + ")" + y_op + "(" + y_logic_2 + ")";
			}
		}
		
		y_interval 			= Math.round((y_to - y_fr) / y_term) + 1;
		y_col_width			= Math.round(y_width / (y_interval + 2));
		
		//System.out.println("y_interval=" + y_interval);
		y_col = new String[y_interval];
		
		//System.out.println("y_col.length=" + y_col.length);
		for (int i=0; i< y_col.length; i++){
			if (set_y_val == 0){
				set_y_val = y_fr;
			} else {
				set_y_val = set_y_val + y_term;
			}
			if (set_y_val <= y_to){
				//System.out.println("set_y_val=" + set_y_val);
				y_col[i] = Integer.toString(Math.round(set_y_val));
			}
		}
		
		arrTbl = new String[y_interval + 1][x_interval + 1];
		
		String[] data_col = new String[x_interval * y_interval];
		//System.out.println("data_col.length=" + data_col.length);
		
		int data_idx = 0;
		String[] conv_logic_y = new String[data_col.length];
		String[] conv_logic_x = new String[data_col.length];
		
		//System.out.println("006");
		for (int i=0; i<y_col.length; i++){
			//y_logic = y_logic.replaceAll("y", y_col[i]);
			for (int j=0; j<x_col.length; j++){
				//x_logic = x_logic.replaceAll("x", x_col[j]);
				
				//System.out.println("data_idx=" + data_idx);
				//System.out.println("x_logic=" + x_logic);
				//System.out.println("y_logic=" + y_logic);
				conv_logic_x[data_idx] = x_logic.replaceAll("x", x_col[j]);
				conv_logic_y[data_idx] = y_logic.replaceAll("y", y_col[i]);
				
				data_idx++;
			}
		}
		//System.out.println("007");
		for (int i=0; i<data_col.length; i++){
			data_col[i] = conv_logic_x[i] + "+" + conv_logic_y[i];
		}
		//System.out.println("008");
		
		
		
		
		System.out.println("x축=" + arrTbl.length + "y축=" + arrTbl[0].length);
		
		for(int i = 0; i < x_col.length; i++) {
			//System.out.println("x_col[" + i + "]=" + x_col[i]);
			arrTbl[0][i] = x_col[i];
			str_width += ", " + y_col_width;
			str_cap += "^" + x_col[i];
			//System.out.println("str_width=" + str_width + "_str_cap=" + str_cap);
		}
		//System.out.println("009");
		for(int i = 0; i < y_col.length; i++) {
			//System.out.println("y_col[" + i + "]=" + y_col[i]);
			arrTbl[i][0] = y_col[i];
		}
		
		//System.out.println("010");
		rt.setBuffering(buf);
		rt.setRowCnt(arrTbl.length);	
		rt.setColCnt(arrTbl[0].length);
		rt.setCaption(str_cap);
		rt.setColWidth(str_width);
		
		rt.addColumn("output","format:#,###.##;");
		for(int i = 0; i < x_col.length; i++) {
			rt.addColumn("output","format:#,###.##;");
		}
		rt.setColumn();
		
		for(int i = 0; i < data_col.length; i++) {
			if (i % x_col.length == 0){
				rowCount++;
				colCount = 1;
			} else {
				colCount++;
			}
			//System.out.println("[" + (rowCount-1) + "][" + colCount + "]=" + data_col[i]);
			arrTbl[rowCount-1][colCount] = data_col[i];
		}
		//System.out.println("011");
		for(int i = 0; i < arrTbl.length; i++) {
			for(int ii = 0; ii < arrTbl[i].length; ii++) {
				if (ii < (arrTbl[i].length - 1)){
					rt.addColValue( arrTbl[i][ii] );
				} else {
					rt.addRowValue( arrTbl[i][ii] );
				}
			}
		}
		//System.out.println("012");
	}catch(Exception e){
		out.print(rt.textFlush());
	}finally{
		out.print(rt.textFlush());
	}
%>
<% /* 작성시간 : Sun May 03 16:47:22 KST 2009 */ %>