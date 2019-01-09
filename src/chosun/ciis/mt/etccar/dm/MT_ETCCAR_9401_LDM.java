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


package chosun.ciis.mt.etccar.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.ds.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_9401_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String driv_mm;

	public MT_ETCCAR_9401_LDM(){}
	public MT_ETCCAR_9401_LDM(String cmpy_cd, String driv_mm){
		this.cmpy_cd = cmpy_cd;
		this.driv_mm = driv_mm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDriv_mm(String driv_mm){
		this.driv_mm = driv_mm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDriv_mm(){
		return this.driv_mm;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_9401_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_9401_LDM dm = (MT_ETCCAR_9401_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.driv_mm);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_9401_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("driv_mm = [" + getDriv_mm() + "]");
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
String driv_mm = req.getParameter("driv_mm");
if( driv_mm == null){
	System.out.println(this.toString+" : driv_mm is null" );
}else{
	System.out.println(this.toString+" : driv_mm is "+driv_mm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String driv_mm = Util.checkString(req.getParameter("driv_mm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String driv_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("driv_mm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setDriv_mm(driv_mm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Sep 12 19:17:22 KST 2012 */