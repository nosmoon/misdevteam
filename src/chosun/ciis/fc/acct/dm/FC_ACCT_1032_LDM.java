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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_1032_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_cd;
	public String use_dt;
	public String kind;
	public String insd_acct_cd;

	public FC_ACCT_1032_LDM(){}
	public FC_ACCT_1032_LDM(String cmpy_cd, String acct_cd, String use_dt, String kind, String insd_acct_cd){
		this.cmpy_cd = cmpy_cd;
		this.acct_cd = acct_cd;
		this.use_dt = use_dt;
		this.kind = kind;
		this.insd_acct_cd = insd_acct_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setUse_dt(String use_dt){
		this.use_dt = use_dt;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public void setInsd_acct_cd(String insd_acct_cd){
		this.insd_acct_cd = insd_acct_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getUse_dt(){
		return this.use_dt;
	}

	public String getKind(){
		return this.kind;
	}

	public String getInsd_acct_cd(){
		return this.insd_acct_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1032_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1032_LDM dm = (FC_ACCT_1032_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acct_cd);
		cstmt.setString(5, dm.use_dt);
		cstmt.setString(6, dm.kind);
		cstmt.setString(7, dm.insd_acct_cd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1032_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("acct_cd = " + getAcct_cd());
        System.out.println("use_dt = " + getUse_dt());
        System.out.println("kind = " + getKind());
        System.out.println("insd_acct_cd = " + getInsd_acct_cd());
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
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String use_dt = req.getParameter("use_dt");
if( use_dt == null){
	System.out.println(this.toString+" : use_dt is null" );
}else{
	System.out.println(this.toString+" : use_dt is "+use_dt );
}
String kind = req.getParameter("kind");
if( kind == null){
	System.out.println(this.toString+" : kind is null" );
}else{
	System.out.println(this.toString+" : kind is "+kind );
}
String insd_acct_cd = req.getParameter("insd_acct_cd");
if( insd_acct_cd == null){
	System.out.println(this.toString+" : insd_acct_cd is null" );
}else{
	System.out.println(this.toString+" : insd_acct_cd is "+insd_acct_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String use_dt = Util.checkString(req.getParameter("use_dt"));
String kind = Util.checkString(req.getParameter("kind"));
String insd_acct_cd = Util.checkString(req.getParameter("insd_acct_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String use_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dt")));
String kind = Util.Uni2Ksc(Util.checkString(req.getParameter("kind")));
String insd_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("insd_acct_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcct_cd(acct_cd);
dm.setUse_dt(use_dt);
dm.setKind(kind);
dm.setInsd_acct_cd(insd_acct_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 27 17:43:58 KST 2009 */