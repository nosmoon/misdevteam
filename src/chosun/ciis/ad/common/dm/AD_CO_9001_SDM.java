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


package chosun.ciis.ad.common.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_CO_9001_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String preng_occr_dt;
	public String mony_kind;

	public AD_CO_9001_SDM(){}
	public AD_CO_9001_SDM(String cmpy_cd, String preng_occr_dt, String mony_kind){
		this.cmpy_cd = cmpy_cd;
		this.preng_occr_dt = preng_occr_dt;
		this.mony_kind = mony_kind;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPreng_occr_dt(String preng_occr_dt){
		this.preng_occr_dt = preng_occr_dt;
	}

	public void setMony_kind(String mony_kind){
		this.mony_kind = mony_kind;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPreng_occr_dt(){
		return this.preng_occr_dt;
	}

	public String getMony_kind(){
		return this.mony_kind;
	}

	public String getSQL(){
		 return "{ call SP_AD_CO_9001_S( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_CO_9001_SDM dm = (AD_CO_9001_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.preng_occr_dt);
		cstmt.setString(5, dm.mony_kind);
		cstmt.registerOutParameter(6, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.common.ds.AD_CO_9001_SDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("preng_occr_dt = " + getPreng_occr_dt());
        System.out.println("mony_kind = " + getMony_kind());
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
String preng_occr_dt = req.getParameter("preng_occr_dt");
if( preng_occr_dt == null){
	System.out.println(this.toString+" : preng_occr_dt is null" );
}else{
	System.out.println(this.toString+" : preng_occr_dt is "+preng_occr_dt );
}
String mony_kind = req.getParameter("mony_kind");
if( mony_kind == null){
	System.out.println(this.toString+" : mony_kind is null" );
}else{
	System.out.println(this.toString+" : mony_kind is "+mony_kind );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
String mony_kind = Util.checkString(req.getParameter("mony_kind"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String preng_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_dt")));
String mony_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("mony_kind")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPreng_occr_dt(preng_occr_dt);
dm.setMony_kind(mony_kind);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 05 08:56:59 KST 2009 */