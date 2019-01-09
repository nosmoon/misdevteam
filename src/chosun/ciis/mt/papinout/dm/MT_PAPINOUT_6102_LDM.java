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


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_6102_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String yyyymm;

	public MT_PAPINOUT_6102_LDM(){}
	public MT_PAPINOUT_6102_LDM(String yyyymm){
		this.yyyymm = yyyymm;
	}

	public void setYyyymm(String yyyymm){
		this.yyyymm = yyyymm;
	}

	public String getYyyymm(){
		return this.yyyymm;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_6102_L(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_6102_LDM dm = (MT_PAPINOUT_6102_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.yyyymm);
		cstmt.registerOutParameter(4, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_6102_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("yyyymm = [" + getYyyymm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String yyyymm = req.getParameter("yyyymm");
if( yyyymm == null){
	System.out.println(this.toString+" : yyyymm is null" );
}else{
	System.out.println(this.toString+" : yyyymm is "+yyyymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String yyyymm = Util.checkString(req.getParameter("yyyymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setYyyymm(yyyymm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 21 16:58:55 KST 2009 */