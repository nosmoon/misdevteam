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


package chosun.ciis.mt.papmeda.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papmeda.ds.*;
import chosun.ciis.mt.papmeda.rec.*;

/**
 * 
 */


public class MT_PAPMEDA_1201_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String meda_yymm_fr;
	public String meda_yymm_to;

	public MT_PAPMEDA_1201_LDM(){}
	public MT_PAPMEDA_1201_LDM(String cmpy_cd, String meda_yymm_fr, String meda_yymm_to){
		this.cmpy_cd = cmpy_cd;
		this.meda_yymm_fr = meda_yymm_fr;
		this.meda_yymm_to = meda_yymm_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMeda_yymm_fr(String meda_yymm_fr){
		this.meda_yymm_fr = meda_yymm_fr;
	}

	public void setMeda_yymm_to(String meda_yymm_to){
		this.meda_yymm_to = meda_yymm_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMeda_yymm_fr(){
		return this.meda_yymm_fr;
	}

	public String getMeda_yymm_to(){
		return this.meda_yymm_to;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPMEDA_1201_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPMEDA_1201_LDM dm = (MT_PAPMEDA_1201_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.meda_yymm_fr);
		cstmt.setString(5, dm.meda_yymm_to);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papmeda.ds.MT_PAPMEDA_1201_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("meda_yymm_fr = [" + getMeda_yymm_fr() + "]");
		System.out.println("meda_yymm_to = [" + getMeda_yymm_to() + "]");
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
String meda_yymm_fr = req.getParameter("meda_yymm_fr");
if( meda_yymm_fr == null){
	System.out.println(this.toString+" : meda_yymm_fr is null" );
}else{
	System.out.println(this.toString+" : meda_yymm_fr is "+meda_yymm_fr );
}
String meda_yymm_to = req.getParameter("meda_yymm_to");
if( meda_yymm_to == null){
	System.out.println(this.toString+" : meda_yymm_to is null" );
}else{
	System.out.println(this.toString+" : meda_yymm_to is "+meda_yymm_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String meda_yymm_fr = Util.checkString(req.getParameter("meda_yymm_fr"));
String meda_yymm_to = Util.checkString(req.getParameter("meda_yymm_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String meda_yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("meda_yymm_fr")));
String meda_yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("meda_yymm_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMeda_yymm_fr(meda_yymm_fr);
dm.setMeda_yymm_to(meda_yymm_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 08 19:35:30 KST 2009 */