/**************************************************************************************************
* ���ϸ� : SE_SND_1220_ADM.java
* ��� : �Ǹ� - �߼۰��� - �뼱���е��
* �ۼ����� : 2009.01.20
* �ۼ��� :   �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.ds.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_SND_1220_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd       ;
	public String job_clsf      ;
	public String cd_clsf       ;
	public String cd_key        ;
	public String mode          ;
	public String cd            ;
	public String cdnm          ;
	public String use_yn        ;
	public String mang_cd_1     ;
	public String incmg_pers_ip ;
	public String incmg_pers    ;

	public SE_SND_1220_ADM(){}
	public SE_SND_1220_ADM(String cmpy_cd, String job_clsf, String cd_clsf, String cd_key, String mode, String cd, String cdnm, String use_yn, String mang_cd_1, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd       = cmpy_cd      ;
		this.job_clsf      = job_clsf     ;
		this.cd_clsf       = cd_clsf      ;
		this.cd_key        = cd_key       ;
		this.mode          = mode         ;
		this.cd            = cd           ;
		this.cdnm          = cdnm         ;
		this.use_yn        = use_yn       ;
		this.mang_cd_1     = mang_cd_1    ;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers    = incmg_pers   ;
	}

	public String getCd() {
		return cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}
	public String getCd_clsf() {
		return cd_clsf;
	}
	public void setCd_clsf(String cd_clsf) {
		this.cd_clsf = cd_clsf;
	}
	public String getCd_key() {
		return cd_key;
	}
	public void setCd_key(String cd_key) {
		this.cd_key = cd_key;
	}
	public String getCdnm() {
		return cdnm;
	}
	public void setCdnm(String cdnm) {
		this.cdnm = cdnm;
	}
	public String getCmpy_cd() {
		return cmpy_cd;
	}
	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}
	public String getIncmg_pers_ip() {
		return incmg_pers_ip;
	}
	public void setIncmg_pers_ip(String incmg_pers_ip) {
		this.incmg_pers_ip = incmg_pers_ip;
	}
	public String getJob_clsf() {
		return job_clsf;
	}
	public void setJob_clsf(String job_clsf) {
		this.job_clsf = job_clsf;
	}
	public String getMang_cd_1() {
		return mang_cd_1;
	}
	public void setMang_cd_1(String mang_cd_1) {
		this.mang_cd_1 = mang_cd_1;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getUse_yn() {
		return use_yn;
	}
	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}
	
	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_1220_ADataSet();
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_1220_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_1220_ADM dm = (SE_SND_1220_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.job_clsf);
		cstmt.setString(5, dm.cd_clsf);
		cstmt.setString(6, dm.cd_key);
		cstmt.setString(7, dm.mode);
		cstmt.setString(8, dm.cd);
		cstmt.setString(9, dm.cdnm);
		cstmt.setString(10, dm.use_yn);
		cstmt.setString(11, dm.mang_cd_1);
		cstmt.setString(12, dm.incmg_pers_ip);
		cstmt.setString(13, dm.incmg_pers);
	}
	

	
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String cd_clsf = req.getParameter("cd_clsf");
if( cd_clsf == null){
	System.out.println(this.toString+" : cd_clsf is null" );
}else{
	System.out.println(this.toString+" : cd_clsf is "+cd_clsf );
}
String cd = req.getParameter("cd");
if( cd == null){
	System.out.println(this.toString+" : cd is null" );
}else{
	System.out.println(this.toString+" : cd is "+cd );
}
String cd_nm = req.getParameter("cd_nm");
if( cd_nm == null){
	System.out.println(this.toString+" : cd_nm is null" );
}else{
	System.out.println(this.toString+" : cd_nm is "+cd_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
String cd = Util.checkString(req.getParameter("cd"));
String cd_nm = Util.checkString(req.getParameter("cd_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String cd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_clsf")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String cd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setJob_clsf(job_clsf);
dm.setCd_clsf(cd_clsf);
dm.setCd(cd);
dm.setCd_nm(cd_nm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jan 19 15:55:59 KST 2009 */