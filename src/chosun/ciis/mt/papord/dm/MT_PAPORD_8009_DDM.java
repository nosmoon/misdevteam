/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mt.papord.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.ds.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_8009_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String issu_dt;

	public MT_PAPORD_8009_DDM(){}
	public MT_PAPORD_8009_DDM(String cmpy_cd, String fac_clsf, String issu_dt){
		this.cmpy_cd = cmpy_cd;
		this.fac_clsf = fac_clsf;
		this.issu_dt = issu_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPORD_8009_D(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPORD_8009_DDM dm = (MT_PAPORD_8009_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fac_clsf);
		cstmt.setString(5, dm.issu_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papord.ds.MT_PAPORD_8009_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
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
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setIssu_dt(issu_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 06 17:37:31 KST 2017 */