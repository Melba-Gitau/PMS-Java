<?php

use Illuminate\Support\Facades\Route;
use App\Models\LoginForm;
use Illuminate\Http\Request;


Route::get('/',function(){
    return view('login');
});

Route::post('/',function(Request $request){
    $name = $request->input('name');
    $email = $request->input('email');
    $password = $request->input('password');
    $gender = $request->input('gender');
    $phone = $request->input('phone');
    $age = $request->input('age');
    $address = $request->input('address');
    return response()->json(['message' => 'Login successful']); 
});
Route::get('/apply',function(){
    return view('application');
});
Route::post('/apply',function(Request $request){
    $title = $request->input('title');
    $contract = $request->input('contract');
    $desc = $request->input('desc');
    $publish = $request->input('date');
    return response()->json(['message' => 'Sent successful']); 
});
