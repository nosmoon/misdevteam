/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 2017-01-05
* �ۼ��� : �� �� ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ :  
* �������� : 
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;


/**
 * 
 */


public class SS_L_NEWJUSO_APPR_HISDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bldmngnn;

	public SS_L_NEWJUSO_APPR_HISDM(){}
	public SS_L_NEWJUSO_APPR_HISDM(String bldmngnn){
		this.bldmngnn = bldmngnn;
	}

	public void setBldmngnn(String bldmngnn){
		this.bldmngnn = bldmngnn;
	}

	public String getBldmngnn(){
		return this.bldmngnn;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_NEWJUSO_APPR_HIS( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_NEWJUSO_APPR_HISDM dm = (SS_L_NEWJUSO_APPR_HISDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bldmngnn);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_NEWJUSO_APPR_HISDataSet();
	}



    public void print(){
        System.out.println("bldmngnn = " + getBldmngnn());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String bldmngnn = req.getParameter("bldmngnn");
if( bldmngnn == null){
	System.out.println(this.toString+" : bldmngnn is null" );
}else{
	System.out.println(this.toString+" : bldmngnn is "+bldmngnn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bldmngnn = Util.checkString(req.getParameter("bldmngnn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bldmngnn = Util.Uni2Ksc(Util.checkString(req.getParameter("bldmngnn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBldmngnn(bldmngnn);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Oct 17 16:48:22 KST 2017 */