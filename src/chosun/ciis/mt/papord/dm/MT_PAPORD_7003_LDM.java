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


public class MT_PAPORD_7003_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String papcmpy_cd;

	public MT_PAPORD_7003_LDM(){}
	public MT_PAPORD_7003_LDM(String cmpy_cd, String papcmpy_cd){
		this.cmpy_cd = cmpy_cd;
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPORD_7003_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPORD_7003_LDM dm = (MT_PAPORD_7003_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.papcmpy_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papord.ds.MT_PAPORD_7003_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("papcmpy_cd = [" + getPapcmpy_cd() + "]");
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
String papcmpy_cd = req.getParameter("papcmpy_cd");
if( papcmpy_cd == null){
	System.out.println(this.toString+" : papcmpy_cd is null" );
}else{
	System.out.println(this.toString+" : papcmpy_cd is "+papcmpy_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String papcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setPapcmpy_cd(papcmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 04 17:00:46 KST 2009 */