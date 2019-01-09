
var app = angular.module('4100', ['ngAnimate', 'ngTouch', 'ui.grid', 'ui.grid.pinning', 'ui.grid.moveColumns', 'ui.grid.resizeColumns', 'ui.grid.exporter', 'ui.grid.pagination', 'ui.grid.selection']);
/*--------------------------------
//서버 통신간 한글깨짐 방지
app.config(function ($httpProvider,$httpParamSerializerJQLikeProvider){
	$httpProvider.defaults.transformRequest.unshift($httpParamSerializerJQLikeProvider.$get());
});
--------------------------------*/

//kr-input 설정:한글입력시 실시간 바인드 되게 설정함 
app.directive('krInput', ['$parse', function($parse) {
    return {
        priority : 2,
        restrict : 'A',
        compile : function(element) {
            element.on('compositionstart', function(e) {
                e.stopImmediatePropagation();
	            });
        },
    };
}]);


app.controller('ctrl4100', ['$scope', '$http', 'uiGridConstants', 'exportUiGridService', function($scope, $http, uiGridConstants, exportUiGridService ) {
	
	//초기값 설정
	$scope.title  = "CRUD Sample";
	$scope.code   = {};
	$scope.detail = {};
	$scope.totalcnt = 0;


	//GRID 속성설정
	$scope.gridOptions1 = {
		rowHeight:			26,
		flatEntityAcess:	true,
		fastWatch:			true,
		multiSelect:		true,
		enableSelectAll: 	true,
		enableFullRowSelection:	true,
		selectionRowHeaderWidth: 35,		
		//Filtering
		enableFiltering:	false,
		//Footer
		showGridFooter:		true,
		//Paging
		paginationPageSizes: [10, 15, 20, 50, 80, 100],
		paginationPageSize:	 15,
		//Sort
		enableSorting:		true,
		//Handlers, Template
		appScopeProvider:	{
			onGridDblClick : function(row) {
				$scope.detail.dept_nm = row.entity.dept_nm;
				$scope.detail.part_nm = row.entity.part_nm;
				$scope.detail.area_nm = row.entity.area_nm;
				$scope.detail.bo_cd   = row.entity.bo_cd;
				$scope.detail.bo_nm   = row.entity.bo_nm;
				$scope.detail.bo_seq  = row.entity.bo_seq;
				$scope.detail.qty     = row.entity.qty;
				$scope.detail.uprc    = row.entity.uprc;
				$scope.detail.amt     = row.entity.amt;
				$scope.detail.dept_cd = row.entity.dept_cd;
				$scope.detail.part_cd = row.entity.part_cd;
				$scope.detail.area_cd = row.entity.area_cd;
			}
		},
		rowTemplate:		'<div ng-dblclick="grid.appScope.onGridDblClick(row)" ng-repeat="col in colContainer.renderedColumns track by col.colDef.name" class="ui-grid-cell" ui-grid-cell></div>',
		//Export data
		enableGridMenu:			true,
		exporterMenuPdf:		false,
		exporterMenuCsv:		false,
		//exporterCsvFilename: 	'sample.csv',
	    //exporterCsvLinkElement: angular.element(document.querySelectorAll(".custom-csv-link-location")),
		
		//그리드에서  엑셀 다운로드 추가-시작
        gridMenuCustomItems: [
        		{
        			title: '전체자료 엑셀저장',
            		action: function ($event) {
								exportUiGridService.exportToExcel('sheet 1', $scope.gridApi, 'all', 'all');
                	},
                    order: 110
                },
                {
                    title: '감춰진 자료제외 엑셀저장',
                    action: function ($event) {
                        		exportUiGridService.exportToExcel('sheet 1', $scope.gridApi, 'visible', 'visible');
                    },
                    order: 111
                },
                {
                    title: '선택내용 엑셀저장',
                    action: function ($event) {
                        		exportUiGridService.exportToExcel('sheet 1', $scope.gridApi, 'selected', 'visible');
                    },
                    order: 112
                }
		]
	};

	
	//GRID 컬럼설정
	$scope.gridOptions1.columnDefs = [
			  { name:'팀',   		field: 'dept_nm' , 		width:80 },
			  { name:'파트',   		field: 'part_nm' , 		width:80 }, 
			  { name:'지역',     	field: 'area_nm' , 		width:80 }, 
			  { name:'센터',  		field: 'bo_nm' , 		width:80 }, 
			  { name:'센터코드', 		field: 'bo_cd' , 		width:80 }, 
			  { name:'순번',    		field: 'bo_seq' , 		width:80 }, 
			  { name:'부수',			field: 'qty' , 			width:80,  cellFilter: 'number' }, 
  			  { name:'단가',			field: 'uprc', 			width:80,  cellFilter: 'number' },
			  { name:'금액',			field: 'amt', 			width:100, cellFilter: 'number' },
			  { name:'dept_cd',		field: 'dept_cd', 		visible: false },
			  { name:'part_cd',		field: 'part_cd', 		visible: false },
			  { name:'area_cd',		field: 'area_cd', 		visible: false }
		]
	;

	//GRID API설정
	$scope.gridOptions1.onRegisterApi = function(gridApi) {
      $scope.gridApi = gridApi;
    };


	//초기 작업 실행
	$http.get("/se/ang/1010").then(function (response) {
        $scope.teamlist = response.data.root.comboSet.teamlist.record;
        $scope.partlist = response.data.root.comboSet.partlist.record;
        $scope.arealist = response.data.root.comboSet.arealist.record;
    });


	//chg1 선택시 실행 함수
    $scope.chg1 = function() {
    	alert($scope.code.dept_cd);
    };

	//chg2 선택시 실행 함수    
    $scope.chg2 = function() {
    	alert($scope.code.part_cd);
    };

	//chg3 선택시 실행 함수
    $scope.chg3 = function() {
    	alert($scope.code.area_cd);
    };
	
	
	//조회 버틀 클릭 시 실행 함수
    $scope.search = function() {
		$scope.result = "";	//필요한 변수 초기화
    	showProgress();	    //progress 보여줌
    	
		$http({
			//비동기 POST방식 SUBMIT
			method  : 'POST',
			url     : '/se/ang/1020',
			data    : $.param($scope.code),
			headers : { 'Content-Type': 'application/x-www-form-urlencoded' }			
		}).success(function(data, status) {
		    //성공 후 처리
		    $scope.totalcnt = data.root.gridData.totalcnt;
			$scope.result   = data; //.root.gridData.record;
			$scope.gridOptions1.data = data.root.gridData.record;
			
		    if( data.root.gridData.totalcnt == 0 ) {
				alert("no data found");
				$scope.gridOptions1.data = [];
		    }

			hideProgress(); //progress 감춤
		});
    };

    
	//필터 버튼 클릭 시 실행 함수
	$scope.toggleFiltering = function() {
		$scope.gridOptions1.enableFiltering = !$scope.gridOptions1.enableFiltering;
		$scope.gridApi.core.notifyDataChange( uiGridConstants.dataChange.COLUMN );
	};
	
	//Excel 버튼 클릭 시 실행 함수
	$scope.excel = function() {
		exportUiGridService.exportToExcel('sheet 1', $scope.gridApi, 'all', 'all');
	};
	
	//Instance 버튼 클릭 시 실행 함수
	$scope.toggleInstance = function() {
		$("#textarea1").toggle();
	};
	
	//선택된자료 버튼 클릭 시 실행 함수
	$scope.selectedData = function() {		
		var rows = $scope.gridApi.selection.getSelectedRows();
		var data = "[";
		angular.forEach(rows, function(row, rowkey) {
			data += "{";
			angular.forEach(row, function(colval, colkey) {
				data += "\"" + colkey + "\":\"" + colval + "\",";
			});			
			data += "\":\"},";
		});
		data = data.substring(0, data.length - 1) + "]";
		alert(data);
	};

	//등록 버튼 클릭 시 실행 함수	
	$scope.insert = function() {		
		if($scope.detail.bo_cd == null || $scope.detail.bo_nm == null || $scope.detail.bo_seq == null ||
			$scope.detail.bo_cd == "" || $scope.detail.bo_nm == "" || $scope.detail.bo_seq == "" ) {
			alert("등록 할 대상이 없습니다.");
			return;
		}
		alert("등록 시 팀/파트/지역은 [CS총괄팀/해외특판/해외] 로 고정합니다");
		$scope.detail.clsf = "I";
		$scope.process();
	};
	
	//수정 버튼 클릭 시 실행 함수
	$scope.update = function() {
		if($scope.detail.bo_cd == "" || $scope.detail.bo_cd == null) {
			alert("수정 할 대상이 없습니다.");
			return;
		}
		$scope.detail.clsf = "U";
		$scope.process();
	};
	
	//삭제 버튼 클릭 시 실행 함수
	$scope.delete = function() {
		if($scope.detail.bo_cd == "" || $scope.detail.bo_cd == null) {
			alert("삭제 할 대상이 없습니다.");
			return;
		}
		$scope.detail.clsf = "D";
		$scope.process();
	};
	
	//초기화 버튼 클릭 시 실행 함수
	$scope.init = function() {
		$scope.detail = {};
	};
	
	$scope.process = function() {

		$http({
			//비동기 POST방식 SUBMIT
			method  : 'POST',
			url     : '/se/ang/1030',
			data    : $.param($scope.detail),
			headers : { 'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8' }
		}).success(function(data, status) {
		    //성공 후 처리
		    alert("complete");
		    $scope.init();
		    $scope.search();
		});
	};
	
}])
;
