/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_3503_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acml_yy;
	public String acml_mm;

	public HD_LVCMPY_3503_LDM(){}
	public HD_LVCMPY_3503_LDM(String cmpy_cd, String acml_yy, String acml_mm){
		this.cmpy_cd = cmpy_cd;
		this.acml_yy = acml_yy;
		this.acml_mm = acml_mm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcml_yy(String acml_yy){
		this.acml_yy = acml_yy;
	}

	public void setAcml_mm(String acml_mm){
		this.acml_mm = acml_mm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcml_yy(){
		return this.acml_yy;
	}

	public String getAcml_mm(){
		return this.acml_mm;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_3503_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_3503_LDM dm = (HD_LVCMPY_3503_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acml_yy);
		cstmt.setString(5, dm.acml_mm);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_3503_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acml_yy = [" + getAcml_yy() + "]");
		System.out.println("acml_mm = [" + getAcml_mm() + "]");
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
String acml_yy = req.getParameter("acml_yy");
if( acml_yy == null){
	System.out.println(this.toString+" : acml_yy is null" );
}else{
	System.out.println(this.toString+" : acml_yy is "+acml_yy );
}
String acml_mm = req.getParameter("acml_mm");
if( acml_mm == null){
	System.out.println(this.toString+" : acml_mm is null" );
}else{
	System.out.println(this.toString+" : acml_mm is "+acml_mm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acml_yy = Util.checkString(req.getParameter("acml_yy"));
String acml_mm = Util.checkString(req.getParameter("acml_mm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acml_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("acml_yy")));
String acml_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("acml_mm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcml_yy(acml_yy);
dm.setAcml_mm(acml_mm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jun 13 17:35:34 KST 2009 */