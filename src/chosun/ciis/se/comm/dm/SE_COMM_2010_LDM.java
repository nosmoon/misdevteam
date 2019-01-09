/***************************************************************************************************
* 파일명 : SE_COMM_2010_LDM.java
* 기능 :  발송처 팝업 목록
* 작성일자 : 2009.01.29
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.comm.ds.*;
import chosun.ciis.se.comm.rec.*;

/**
 * 
 */


public class SE_COMM_2010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String area_cd		;
	public String adms_dstc_nm	;
	public String bo_cd			;
	public String send_plac_nm	;
	public String send_plac_seq	;

	public SE_COMM_2010_LDM(){}
	public SE_COMM_2010_LDM(String cmpy_cd, String area_cd, String adms_dstc_nm, String bo_cd, String send_plac_nm, String send_plac_seq){
		this.cmpy_cd 		= cmpy_cd		;
		this.area_cd 		= area_cd		;
		this.adms_dstc_nm 	= adms_dstc_nm	;
		this.bo_cd 			= bo_cd			;
		this.send_plac_nm 	= send_plac_nm	;
		this.send_plac_seq	= send_plac_seq	;
	}

	public String getSend_plac_seq() {
		return send_plac_seq;
	}
	public void setSend_plac_seq(String send_plac_seq) {
		this.send_plac_seq = send_plac_seq;
	}
	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setAdms_dstc_nm(String adms_dstc_nm){
		this.adms_dstc_nm = adms_dstc_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getAdms_dstc_nm(){
		return this.adms_dstc_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getSQL(){
		 return "{ call SP_SE_COMM_2010_L( ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_COMM_2010_LDM dm = (SE_COMM_2010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.area_cd);
		cstmt.setString(5, dm.adms_dstc_nm);
		cstmt.setString(6, dm.bo_cd);
		cstmt.setString(7, dm.send_plac_nm);
		cstmt.setString(8, dm.send_plac_seq);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.comm.ds.SE_COMM_2010_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd		());
        System.out.println("area_cd 		= " + getArea_cd		());
        System.out.println("adms_dstc_nm 	= " + getAdms_dstc_nm	());
        System.out.println("bo_cd 			= " + getBo_cd			());
        System.out.println("send_plac_nm 	= " + getSend_plac_nm	());
        System.out.println("send_plac_seq 	= " + getSend_plac_seq	());
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
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String adms_dstc_nm = req.getParameter("adms_dstc_nm");
if( adms_dstc_nm == null){
	System.out.println(this.toString+" : adms_dstc_nm is null" );
}else{
	System.out.println(this.toString+" : adms_dstc_nm is "+adms_dstc_nm );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String send_plac_nm = req.getParameter("send_plac_nm");
if( send_plac_nm == null){
	System.out.println(this.toString+" : send_plac_nm is null" );
}else{
	System.out.println(this.toString+" : send_plac_nm is "+send_plac_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String adms_dstc_nm = Util.checkString(req.getParameter("adms_dstc_nm"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String send_plac_nm = Util.checkString(req.getParameter("send_plac_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String adms_dstc_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("adms_dstc_nm")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String send_plac_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setArea_cd(area_cd);
dm.setAdms_dstc_nm(adms_dstc_nm);
dm.setBo_cd(bo_cd);
dm.setSend_plac_nm(send_plac_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 23 11:20:56 KST 2009 */