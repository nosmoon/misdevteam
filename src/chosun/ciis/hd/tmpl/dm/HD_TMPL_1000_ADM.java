

package chosun.ciis.hd.tmpl.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.tmpl.ds.*;
import chosun.ciis.hd.tmpl.rec.*;

/**
 * 
 */


public class HD_TMPL_1000_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String excel_gbn;
	public String filenm;
	public byte[] filecont;

	public HD_TMPL_1000_ADM(){}
	public HD_TMPL_1000_ADM(String cmpy_cd, String excel_gbn, String filenm, byte[] filecont){
		this.cmpy_cd = cmpy_cd;
		this.excel_gbn = excel_gbn;
		this.filenm = filenm;
		this.filecont = filecont;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setExcel_gbn(String excel_gbn){
		this.excel_gbn = excel_gbn;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public void setFilecont(byte[] filecont){
		this.filecont = filecont;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getExcel_gbn(){
		return this.excel_gbn;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public byte[] getFilecont(){
		return this.filecont;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TMPL_1000_A(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TMPL_1000_ADM dm = (HD_TMPL_1000_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.excel_gbn);
		cstmt.setString(5, dm.filenm);
		cstmt.setBytes(6, dm.filecont);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_TMPL_1000_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("excel_gbn = [" + getExcel_gbn() + "]");
		System.out.println("filenm = [" + getFilenm() + "]");
		System.out.println("filecont = [" + getFilecont() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String excel_gbn = req.getParameter("excel_gbn");
if( excel_gbn == null){
	System.out.println(this.toString+" : excel_gbn is null" );
}else{
	System.out.println(this.toString+" : excel_gbn is "+excel_gbn );
}
String filenm = req.getParameter("filenm");
if( filenm == null){
	System.out.println(this.toString+" : filenm is null" );
}else{
	System.out.println(this.toString+" : filenm is "+filenm );
}
String filecont = req.getParameter("filecont");
if( filecont == null){
	System.out.println(this.toString+" : filecont is null" );
}else{
	System.out.println(this.toString+" : filecont is "+filecont );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String excel_gbn = Util.checkString(req.getParameter("excel_gbn"));
String filenm = Util.checkString(req.getParameter("filenm"));
String filecont = Util.checkString(req.getParameter("filecont"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String excel_gbn = Util.Uni2Ksc(Util.checkString(req.getParameter("excel_gbn")));
String filenm = Util.Uni2Ksc(Util.checkString(req.getParameter("filenm")));
String filecont = Util.Uni2Ksc(Util.checkString(req.getParameter("filecont")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setExcel_gbn(excel_gbn);
dm.setFilenm(filenm);
dm.setFilecont(filecont);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 13 13:59:35 KST 2010 */