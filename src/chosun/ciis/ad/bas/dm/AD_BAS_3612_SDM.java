/***************************************************************************************************
* 파일명 : .java
* 기능 : 거래처인물정보
* 작성일자 : 2010.07.16
* 작성자 : KBS
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
public class AD_BAS_3612_SDM extends somo.framework.db.BaseDM implements java.io.Serializable
{
	public String cmpy_cd;
	public String dlco_no;

	public AD_BAS_3612_SDM(){}
	

	public String getCmpy_cd() {
		return cmpy_cd;
	}


	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}


	public String getDlco_no() {
		return dlco_no;
	}


	public void setDlco_no(String dlco_no) {
		this.dlco_no = dlco_no;
	}


	public AD_BAS_3612_SDM(String cmpy_cd, String dlco_no) {
		super();
		this.cmpy_cd = cmpy_cd;
		this.dlco_no = dlco_no;
	}


	public String getSQL()
	{
		 return "{ call SP_AD_BAS_3612_S( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException
	{
		AD_BAS_3612_SDM dm = (AD_BAS_3612_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_no);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject()
	{
		return new chosun.ciis.ad.bas.ds.AD_BAS_3612_SDataSet();
	}

    public void print()
    {
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("dlco_no = " + getDlco_no());
    }
}