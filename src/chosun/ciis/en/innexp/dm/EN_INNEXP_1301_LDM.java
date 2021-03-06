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


package chosun.ciis.en.innexp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.ds.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_1301_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clos_dt_fr;
	public String clos_dt_to;

	public EN_INNEXP_1301_LDM(){}
	public EN_INNEXP_1301_LDM(String cmpy_cd, String clos_dt_fr, String clos_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.clos_dt_fr = clos_dt_fr;
		this.clos_dt_to = clos_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_dt_fr(String clos_dt_fr){
		this.clos_dt_fr = clos_dt_fr;
	}

	public void setClos_dt_to(String clos_dt_to){
		this.clos_dt_to = clos_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClos_dt_fr(){
		return this.clos_dt_fr;
	}

	public String getClos_dt_to(){
		return this.clos_dt_to;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_1301_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_1301_LDM dm = (EN_INNEXP_1301_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clos_dt_fr);
		cstmt.setString(5, dm.clos_dt_to);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_1301_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("clos_dt_fr = " + getClos_dt_fr());
        System.out.println("clos_dt_to = " + getClos_dt_to());
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
String clos_dt_fr = req.getParameter("clos_dt_fr");
if( clos_dt_fr == null){
	System.out.println(this.toString+" : clos_dt_fr is null" );
}else{
	System.out.println(this.toString+" : clos_dt_fr is "+clos_dt_fr );
}
String clos_dt_to = req.getParameter("clos_dt_to");
if( clos_dt_to == null){
	System.out.println(this.toString+" : clos_dt_to is null" );
}else{
	System.out.println(this.toString+" : clos_dt_to is "+clos_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clos_dt_fr = Util.checkString(req.getParameter("clos_dt_fr"));
String clos_dt_to = Util.checkString(req.getParameter("clos_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clos_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_dt_fr")));
String clos_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClos_dt_fr(clos_dt_fr);
dm.setClos_dt_to(clos_dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 13:23:20 KST 2009 */