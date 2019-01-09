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


public class HD_LVCMPY_3500_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acml_yy;
	public String acml_mm;
	public String u_ipadd;
	public String u_id;

	public HD_LVCMPY_3500_ADM(){}
	public HD_LVCMPY_3500_ADM(String cmpy_cd, String acml_yy, String acml_mm, String u_ipadd, String u_id){
		this.cmpy_cd = cmpy_cd;
		this.acml_yy = acml_yy;
		this.acml_mm = acml_mm;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
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

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
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

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_3500_A(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_3500_ADM dm = (HD_LVCMPY_3500_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acml_yy);
		cstmt.setString(5, dm.acml_mm);
		cstmt.setString(6, dm.u_ipadd);
		cstmt.setString(7, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_3500_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acml_yy = [" + getAcml_yy() + "]");
		System.out.println("acml_mm = [" + getAcml_mm() + "]");
		System.out.println("u_ipadd = [" + getU_ipadd() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
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
String u_ipadd = req.getParameter("u_ipadd");
if( u_ipadd == null){
	System.out.println(this.toString+" : u_ipadd is null" );
}else{
	System.out.println(this.toString+" : u_ipadd is "+u_ipadd );
}
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acml_yy = Util.checkString(req.getParameter("acml_yy"));
String acml_mm = Util.checkString(req.getParameter("acml_mm"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acml_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("acml_yy")));
String acml_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("acml_mm")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcml_yy(acml_yy);
dm.setAcml_mm(acml_mm);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jun 13 13:44:17 KST 2009 */