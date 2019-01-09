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


public class AS_ASRD_1700_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String search_tag;
	public String item_cd;
	public String item_nm;

	public AS_ASRD_1700_LDM(){}
	public AS_ASRD_1700_LDM(String cmpy_cd, String search_tag, String item_cd, String item_nm){
		this.cmpy_cd = cmpy_cd;
		this.search_tag = search_tag;
		this.item_cd = item_cd;
		this.item_nm = item_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_tag(String search_tag){
		this.search_tag = search_tag;
	}

	public void setItem_cd(String item_cd){
		this.item_cd = item_cd;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_tag(){
		return this.search_tag;
	}

	public String getItem_cd(){
		return this.item_cd;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASRD_1700_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASRD_1700_LDM dm = (AS_ASRD_1700_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.search_tag);
		cstmt.setString(5, dm.item_cd);
		cstmt.setString(6, dm.item_nm);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.asrd.ds.AS_ASRD_1700_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("search_tag = " + getSearch_tag());
        System.out.println("item_cd = " + getItem_cd());
        System.out.println("item_nm = " + getItem_nm());
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
String item_cd = req.getParameter("item_cd");
if( item_cd == null){
	System.out.println(this.toString+" : item_cd is null" );
}else{
	System.out.println(this.toString+" : item_cd is "+item_cd );
}
String item_nm = req.getParameter("item_nm");
if( item_nm == null){
	System.out.println(this.toString+" : item_nm is null" );
}else{
	System.out.println(this.toString+" : item_nm is "+item_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_tag = Util.checkString(req.getParameter("search_tag"));
String item_cd = Util.checkString(req.getParameter("item_cd"));
String item_nm = Util.checkString(req.getParameter("item_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_tag = Util.Uni2Ksc(Util.checkString(req.getParameter("search_tag")));
String item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("item_cd")));
String item_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("item_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSearch_tag(search_tag);
dm.setItem_cd(item_cd);
dm.setItem_nm(item_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 26 14:25:39 KST 2009 */