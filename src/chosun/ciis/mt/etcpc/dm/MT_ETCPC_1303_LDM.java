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


package chosun.ciis.mt.etcpc.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.ds.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_1303_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String modl_mang_no;
	public String use_usag;
	public String buy_dt;

	public MT_ETCPC_1303_LDM(){}
	public MT_ETCPC_1303_LDM(String cmpy_cd, String modl_mang_no, String use_usag, String buy_dt){
		this.cmpy_cd = cmpy_cd;
		this.modl_mang_no = modl_mang_no;
		this.use_usag = use_usag;
		this.buy_dt = buy_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setModl_mang_no(String modl_mang_no){
		this.modl_mang_no = modl_mang_no;
	}

	public void setUse_usag(String use_usag){
		this.use_usag = use_usag;
	}

	public void setBuy_dt(String buy_dt){
		this.buy_dt = buy_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getModl_mang_no(){
		return this.modl_mang_no;
	}

	public String getUse_usag(){
		return this.use_usag;
	}

	public String getBuy_dt(){
		return this.buy_dt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCPC_1303_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_1303_LDM dm = (MT_ETCPC_1303_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.modl_mang_no);
		cstmt.setString(5, dm.use_usag);
		cstmt.setString(6, dm.buy_dt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_1303_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("modl_mang_no = " + getModl_mang_no());
        System.out.println("use_usag = " + getUse_usag());
        System.out.println("buy_dt = " + getBuy_dt());
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
String modl_mang_no = req.getParameter("modl_mang_no");
if( modl_mang_no == null){
	System.out.println(this.toString+" : modl_mang_no is null" );
}else{
	System.out.println(this.toString+" : modl_mang_no is "+modl_mang_no );
}
String use_usag = req.getParameter("use_usag");
if( use_usag == null){
	System.out.println(this.toString+" : use_usag is null" );
}else{
	System.out.println(this.toString+" : use_usag is "+use_usag );
}
String buy_dt = req.getParameter("buy_dt");
if( buy_dt == null){
	System.out.println(this.toString+" : buy_dt is null" );
}else{
	System.out.println(this.toString+" : buy_dt is "+buy_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String modl_mang_no = Util.checkString(req.getParameter("modl_mang_no"));
String use_usag = Util.checkString(req.getParameter("use_usag"));
String buy_dt = Util.checkString(req.getParameter("buy_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String modl_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("modl_mang_no")));
String use_usag = Util.Uni2Ksc(Util.checkString(req.getParameter("use_usag")));
String buy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setModl_mang_no(modl_mang_no);
dm.setUse_usag(use_usag);
dm.setBuy_dt(buy_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 19 10:20:58 KST 2009 */