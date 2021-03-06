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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_9704_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mang_cd_1;

	public HD_AFFR_9704_LDM(){}
	public HD_AFFR_9704_LDM(String cmpy_cd, String mang_cd_1){
		this.cmpy_cd = cmpy_cd;
		this.mang_cd_1 = mang_cd_1;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMang_cd_1(String mang_cd_1){
		this.mang_cd_1 = mang_cd_1;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMang_cd_1(){
		return this.mang_cd_1;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_9704_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_9704_LDM dm = (HD_AFFR_9704_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mang_cd_1);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_9704_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mang_cd_1 = [" + getMang_cd_1() + "]");
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
String mang_cd_1 = req.getParameter("mang_cd_1");
if( mang_cd_1 == null){
	System.out.println(this.toString+" : mang_cd_1 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_1 is "+mang_cd_1 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mang_cd_1 = Util.checkString(req.getParameter("mang_cd_1"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mang_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_1")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMang_cd_1(mang_cd_1);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 23 14:13:25 KST 2009 */