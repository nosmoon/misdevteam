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


package chosun.ciis.as.asrd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.asrd.ds.*;
import chosun.ciis.as.asrd.rec.*;

/**
 * 
 */


public class AS_ASRD_1600_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String search_tag;
	public String aset_no;
	public String aset_nm;
	public String leas_bldg_cd;

	public AS_ASRD_1600_LDM(){}
	public AS_ASRD_1600_LDM(String cmpy_cd, String search_tag, String aset_no, String aset_nm, String leas_bldg_cd){
		this.cmpy_cd = cmpy_cd;
		this.search_tag = search_tag;
		this.aset_no = aset_no;
		this.aset_nm = aset_nm;
		this.leas_bldg_cd = leas_bldg_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_tag(String search_tag){
		this.search_tag = search_tag;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setLeas_bldg_cd(String leas_bldg_cd){
		this.leas_bldg_cd = leas_bldg_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_tag(){
		return this.search_tag;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getLeas_bldg_cd(){
		return this.leas_bldg_cd;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASRD_1600_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASRD_1600_LDM dm = (AS_ASRD_1600_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.search_tag);
		cstmt.setString(5, dm.aset_no);
		cstmt.setString(6, dm.aset_nm);
		cstmt.setString(7, dm.leas_bldg_cd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.asrd.ds.AS_ASRD_1600_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("search_tag = " + getSearch_tag());
        System.out.println("aset_no = " + getAset_no());
        System.out.println("aset_nm = " + getAset_nm());
        System.out.println("leas_bldg_cd = " + getLeas_bldg_cd());
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
String search_tag = req.getParameter("search_tag");
if( search_tag == null){
	System.out.println(this.toString+" : search_tag is null" );
}else{
	System.out.println(this.toString+" : search_tag is "+search_tag );
}
String aset_no = req.getParameter("aset_no");
if( aset_no == null){
	System.out.println(this.toString+" : aset_no is null" );
}else{
	System.out.println(this.toString+" : aset_no is "+aset_no );
}
String aset_nm = req.getParameter("aset_nm");
if( aset_nm == null){
	System.out.println(this.toString+" : aset_nm is null" );
}else{
	System.out.println(this.toString+" : aset_nm is "+aset_nm );
}
String leas_bldg_cd = req.getParameter("leas_bldg_cd");
if( leas_bldg_cd == null){
	System.out.println(this.toString+" : leas_bldg_cd is null" );
}else{
	System.out.println(this.toString+" : leas_bldg_cd is "+leas_bldg_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_tag = Util.checkString(req.getParameter("search_tag"));
String aset_no = Util.checkString(req.getParameter("aset_no"));
String aset_nm = Util.checkString(req.getParameter("aset_nm"));
String leas_bldg_cd = Util.checkString(req.getParameter("leas_bldg_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_tag = Util.Uni2Ksc(Util.checkString(req.getParameter("search_tag")));
String aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no")));
String aset_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_nm")));
String leas_bldg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_bldg_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSearch_tag(search_tag);
dm.setAset_no(aset_no);
dm.setAset_nm(aset_nm);
dm.setLeas_bldg_cd(leas_bldg_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 14:05:25 KST 2009 */