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


package chosun.ciis.en.innexp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.ds.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_1013_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bal_occr_slip_no;

	public EN_INNEXP_1013_LDM(){}
	public EN_INNEXP_1013_LDM(String cmpy_cd, String bal_occr_slip_no){
		this.cmpy_cd = cmpy_cd;
		this.bal_occr_slip_no = bal_occr_slip_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBal_occr_slip_no(String bal_occr_slip_no){
		this.bal_occr_slip_no = bal_occr_slip_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBal_occr_slip_no(){
		return this.bal_occr_slip_no;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_1013_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_1013_LDM dm = (EN_INNEXP_1013_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bal_occr_slip_no);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_1013_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("bal_occr_slip_no = " + getBal_occr_slip_no());
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
String bal_occr_slip_no = req.getParameter("bal_occr_slip_no");
if( bal_occr_slip_no == null){
	System.out.println(this.toString+" : bal_occr_slip_no is null" );
}else{
	System.out.println(this.toString+" : bal_occr_slip_no is "+bal_occr_slip_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bal_occr_slip_no = Util.checkString(req.getParameter("bal_occr_slip_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bal_occr_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("bal_occr_slip_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setBal_occr_slip_no(bal_occr_slip_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 16 18:54:32 KST 2009 */