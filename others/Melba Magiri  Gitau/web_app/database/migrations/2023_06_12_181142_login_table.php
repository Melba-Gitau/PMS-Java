<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;
use App\Models\LoginForm;

return new class extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        //
        Schema::create('login', function(Blueprint $table){
            $table->id();
            $table->String('Name');
            $table->text('Email');
            $table->text('Password');
            $table->text('Gender');
            $table->text('Phone');
            $table->text('Age');
            $table->text('Address');
            $table->timestamps();
        });
    }
   

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        //
    }
};
