# User Guide

## Introduction

**Accouminate** is a desktop application designed to manage finances for busy students. With **Accouminate**, students can take charge of their finances by keeping track of their daily expenses, setting both short-term and long-term financial goals, and maintaining their investment records.

This application uses a Command Line Interface (CLI) for quick and easy task management activities.

## Quick Start

1. Ensure that you have Java 11 or above installed.
2. Down the latest version of `Accouminate` [here](http://link.to/duke).
3. Open your terminal (Mac/Linux) or your command prompt (Windows).
4. Navigate to the folder where you have placed your `accouminate.jar` and run `java -jar accouminate.jar`. The standard greeting message will be shown if there is no error.

## Features 

In the **Accouminate** application, there are four main features.

1. Manage expenses
2. Manage incomes
3. Manage budgets
4. Manage investments

After every command is executed, the user data is automatically saved on the computer. The next time the application is launched, all the user data will be loaded automatically.


## Commands

The main commands are separated according to their features. Subcommands are used with each main command to achieve user's desired task. For example, `[MAIN_CMD] [SUB_CMD] [ARGS] [-FLAGS]`.

### Expense - `expense`

#### Adding an expense - `add`
Adds an expense in the current month to the database. The current date will be tagged to the expense added.

Format: `expense add [NAME] -v [VALUE] -c [CATEGORY]`

Arguments:
- `NAME`
  - The name of the expense is case sensitive, and shall contain any characters except for “-”.
  - The name can be non-unique.
- `VALUE`
  - The value shall be any positive number (integer or float values).
  - Float values with more than two decimal places specified are truncated to two decimal places.
  - If a non-numeric string, negative number, or zero is provided, an error message is shown.
- `CATEGORY`
  - The name of the category is case sensitive, and shall contain any characters except for "-".
  - The category is not a mandatory field.

Example of usage: 

- `expense add Eat Lunch -v 10.99 -c Meals`

<br />

#### Listing expenses - `list`
Shows a list of all expenses, or a list of expenses grouped by their categories. Only expenses in the current month are listed.

Format: `expense list [-c]`

Arguments:
- `-c`
  - If the category flag is not specified, all the expenses in the current month are listed, in reverse chronological order.
  - If the category flag is specified, the expenses will be grouped by their categories.

<br />

#### Deleting an expense - `delete`
Deletes expense record(s) from the database by the unique identifier (from list) or by the name.

Format: `expense delete -n [NAME] -i [ID]`

Arguments:
- `NAME`
  - The names of the expense are case sensitive, and can contain any characters except for “-”.
  - The length of the name is limited to 64 characters.
  - If there are multiple repeated names, then all these expenses will be selected as candidates for deletion.
- `ID`
  - The id number shall be an positive integer.
  - If not a positive integer is provided, then an error message is shown.

Both arguments are mutually exclusive. This means that if both the name and id are specified, an error message is displayed.

Example of usage:

- `expense delete -n Eat lunch`
- `expense delete -i 2`

<hr />

### Income - `income`

#### Adding an income source - `add`
Adds an income source.

Format: `income add [NAME] -v [VALUE]`

Arguments:
- `NAME`
  - The name of the income source is case sensitive, and shall contain any characters except for “-”.
  - The length of the name is limited to 64 characters.
  - Names can be non-unique.
- `VALUE`
  - The value shall be any positive number (integer or float values).
  - Float values with more than two decimal places specified are truncated to two decimal places.
  - If a non-numeric string, negative number, or zero is provided, an error message is shown.

Example of usage:

- `income add Pocket Money -v 50`

<br />

#### Listing all income sources - `list`
Shows a list of all income sources for the current month.

Format: `income list`

<br />

#### Deleting an income source - `delete`

Deletes an income source from the database by its unique identifier or by its name. Note that the name must match exactly to that in the database in order for it to be deleted.

Format: `income delete -n [NAME] -i [ID]`

Arguments:
- `NAME`
  - The names of the income sources are case sensitive, and can contain any characters except for “-”.
  - The length of the name is limited to 64 characters.
  - If there are multiple repeated names, then all these expenses will be selected as candidates for deletion.
- `ID`
  - The id number shall be an positive integer.
  - If not a positive integer is provided, then an error message is shown.

<hr />

### Budget - `budget`

#### Adding a budget - `add`

Adds a budget plan for the current month.

Format: `budget add -v [VALUE]`

Argument:
- `VALUE`
  - The value shall be any positive number (integer or float values).
  - Float values with more than two decimal places specified are truncated to two decimal places.
  - If a non-numeric string, negative number, or zero is provided, an error message is shown.

Example of usage:
- `budget add -v 1000`

<br />

#### Listing the budget - `list`

Shows the current budget, as specified by the user.

Format: `budget list`

<br />

#### Deleting the budget - `delete`

Deletes the budget for current month, or effectively setting it to 0.

Format: `budget delete`

<hr />

## FAQ

**Q**: How do I transfer my data to another computer? 

**A**: {your answer here}

## Command Summary


| Function | Command |
| ---------| --------|
| Add expense | `expense add [NAME] -v [VALUE] -c [CATEGORY]` |
| Delete expense | `expense delete -n [NAME] -i [ID]` |
| List expenses | `expense list` |
| Add income | `income add [NAME] -v [VALUE]` |
| Delete income | `income delete -n [NAME] -i [ID]` |
| List incomes | `income list` |
| Add budget | `budget add -v [VALUE]` |
| List budget | `budget list` |
| Delete budget | `budget delete` |
