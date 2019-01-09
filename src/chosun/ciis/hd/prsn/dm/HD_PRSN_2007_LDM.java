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


package chosun.ciis.hd.prsn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prsn.ds.*;
import chosun.ciis.hd.prsn.rec.*;

/**
 * 
 */


public class HD_PRSN_2007_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String now_dt;

	public HD_PRSN_2007_LDM(){}
	public HD_PRSN_2007_LDM(String now_dt){
		this.now_dt = now_dt;
	}

	public void setNow_dt(String now_dt){
		this.now_dt = now_dt;
	}

	public String getNow_dt(){
		return this.now_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_PRSN_2007_L(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_PRSN_2007_LDM dm = (HD_PRSN_2007_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.now_dt);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.prsn.ds.HD_PRSN_2007_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("now_dt = [" + getNow_dt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String now_dt = req.getParameter("now_dt");
if( now_dt == null){
	System.out.println(this.toString+" : now_dt is null" );
}else{
	System.out.println(this.toString+" : now_dt is "+now_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String now_dt = Util.checkString(req.getParameter("now_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String now_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("now_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setNow_dt(now_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jul 14 16:29:37 KST 2009 */