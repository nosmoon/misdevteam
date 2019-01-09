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


package chosun.ciis.ad.bas.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BAS_1570_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public long seq;
	public String night_shift_dt;

	public AD_BAS_1570_SDM(){}
	public AD_BAS_1570_SDM(String cmpy_cd, long seq, String night_shift_dt){
		this.cmpy_cd = cmpy_cd;
		this.seq = seq;
		this.night_shift_dt = night_shift_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setNight_shift_dt(String night_shift_dt){
		this.night_shift_dt = night_shift_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public long getSeq(){
		return this.seq;
	}

	public String getNight_shift_dt(){
		return this.night_shift_dt;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_1570_S(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1570_SDM dm = (AD_BAS_1570_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setLong(4, dm.seq);
		cstmt.setString(5, dm.night_shift_dt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1570_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("night_shift_dt = [" + getNight_shift_dt() + "]");
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String night_shift_dt = req.getParameter("night_shift_dt");
if( night_shift_dt == null){
	System.out.println(this.toString+" : night_shift_dt is null" );
}else{
	System.out.println(this.toString+" : night_shift_dt is "+night_shift_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String night_shift_dt = Util.checkString(req.getParameter("night_shift_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String night_shift_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("night_shift_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSeq(seq);
dm.setNight_shift_dt(night_shift_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 14:52:27 KST 2009 */